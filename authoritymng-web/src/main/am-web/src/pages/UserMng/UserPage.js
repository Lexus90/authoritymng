import React, { PureComponent, Fragment } from 'react';
import {
    Card,
    Form,
    Input,
    DatePicker,
    Select,
    Button,
    InputNumber,
    Radio,
    Icon,
    Tooltip,
    Table,
    Popconfirm,
    Divider,
    Dropdown,
    Badge,
    Menu,
    message
} from 'antd';
import { connect } from 'dva';

import PageHeaderWrapper from '@/components/PageHeaderWrapper';
import styles from './style.less';




@connect(({ users_md, loading }) => ({
    // loading: loading.effects['users/queryList'],
    users_md,
    users: users_md.users,
    roles: users_md.users.roles,
    loading: loading.models.users_md,
}))
export default class UserMng extends PureComponent {
    constructor(props) {
        super(props);
        this.state = {
            filtersArg: ''
        };
    };

    componentDidMount() {
        this.listUserPage( 0, 10, this.state.filtersArg );
    };

    listUserPage = (current, pageSize, filtersArg) => {
        if (!!filtersArg && filtersArg.includes("'")) {
            return false;
        }
        this.props.dispatch({
            type: 'users_md/listPage',
            payload: {
                current,
                pageSize,
                userCode: filtersArg,
            }
        });
    };

    searchChange = (e) => {
        let { value } = e.target;
        this.setState({filtersArg: value});
        this.listUserPage(0, 10, value);
    };

    search = ()=>{
        return (
            <input placeholder="输入UserCode" onChange={this.searchChange}/>
        )
    };

    onChange = (pagination) => {
        let  {
            current ,
            pageSize ,
        } = pagination;
        this.listUserPage(current, pageSize, this.state.filtersArg);

    };

    render() {
        const { location, route, users:{list, pagination}, roles, loading} = this.props;
        return (
            <PageHeaderWrapper
                title={route.name}
                tabActiveKey={location.pathname}
                content={route.name}
            >
                <Card title="用户列表" style={{ marginBottom: 24 }} bordered={false}>
                    <EditableTable
                        title = {this.search}
                        dataSource = {!!list ? list : []}
                        pagination = {pagination}
                        loading={loading}
                        subData = {roles}
                        onChange = {this.onChange}
                    />
                </Card>
            </PageHeaderWrapper>
        );
    };
}

const EditableCell = ({ editable, changeEnable, value, onChange }) => (
    <div>
        {editable && changeEnable ? (
            <Input
                style={{ margin: '-5px 0' }}
                value={value}
                onChange={e => onChange(e.target.value)}
            />
        ) : (
            value
        )}
    </div>
);

class EditableTable extends React.Component {
    constructor(props) {
        super(props);
        this.columns = [
            {
                title: '用户名', dataIndex: 'userName', key: 'userName', width: '15%',
                render: (text, record) => this.renderColumns(text, record, 'userName', true),
            },
            {
                title: '用户CODE', dataIndex: 'userCode', key: 'userCode', width: '15%',
                render: (text, record) => this.renderColumns(text, record, 'userCode', true),
            },
            {
                title: '在职状态', width: '15%', dataIndex: 'userState', key: 'userState',
                render: (text, record) => this.renderColumns(text, record, 'userState', true),
            },
            {
                title: '操作', dataIndex: 'operation',
                render: (text, record) => {
                    let editable = record.userCode == this.state.editRow;
                    return (
                        <div className="editable-row-operations">
                            {editable ? (
                                <span>
                                    <a onClick={(e) => this.save(e, record)}>保存 </a>
                                    <Popconfirm
                                        title="Sure to cancel?"
                                        onConfirm={(e) => this.cancel(e, record.userCode)}
                                        onCancel={(e) => {e.stopPropagation()}}
                                    >
                                        <a onClick={(e) => {e.stopPropagation()}}>取消</a>
                                    </Popconfirm>
                                </span>
                            ) : (
                                <span>
                                    <a onClick={(e) => this.edit(e, record.userCode)}>修改</a> <br />
                                    <Popconfirm title="确认删除该用户?" onConfirm={(e) => this.deleteUser(e, record)}
                                                onCancel={(e) => {e.stopPropagation()}}>
                                        <a href="javascript:;" onClick={(e) => {e.stopPropagation()}}>删除</a>
                                    </Popconfirm>
                                </span>

                            )}
                        </div>
                    );
                },
            },
        ];
        this.state = {
            editRow:'',
        };
    }

    renderColumns(text, record, column, changeEnable) {
        let editable = record.userCode == this.state.editRow;
        return (
            <EditableCell
                editable={editable}
                changeEnable={changeEnable}
                value={text}
                onChange={value => this.handleChange(value, record.userCode, column)}
            />
        );
    }

    edit(e, userCode) {
        e.stopPropagation();
        this.setEditRow(userCode);
    }

    save(e, userInfo) {
        e.stopPropagation();
        this.props.dispatch({
            type: 'users/updateUser',
            payload: userInfo,
        });
        this.setEditRow('');
    }

    setEditRow = (userCode) => {
        this.setState({editRow: userCode});
    };

    deleteUser(e, userInfo) {
        e.stopPropagation();

        this.props.dispatch({
            type: 'users/deleteUser',
            payload: userInfo,
        });

    }

    cancel(e, userCode) {
        e.stopPropagation();
        this.setEditRow('');
    }

    expandedRowRender = (record)=> {

        const {id} = record;
        return (<UserRoleTable
            data = {this.props.subData}
        />);
    }

    render() {
        const { dataSource, pagination, subData, loading, onChange, title } = this.props;
        return <Table rowKey={record => record.userCode}
                      dataSource={dataSource}
                      pagination={pagination}
                      loading={loading}
                      onChange={onChange}
                      expandedRowRender = {this.expandedRowRender}
                      columns={this.columns}
                      expandRowByClick = {true}
                      expandIconAsCell = {false}
                      title = {title}/>;
    }
}

class UserRoleTable extends React.Component {
    constructor(props) {
        super(props);
        this.columns = [
            {
                title: '项目名称', dataIndex: 'proName', key: 'proName',
                render: (text, record) => this.renderColumns(text, record, 'proName', true),
            },
            {
                title: '项目类型', dataIndex: 'proType', key: 'proType',
                render: (text, record) => this.renderColumns(text, record, 'proType', true)
            },
            // { title: 'role', key: 'role', render: () => <span><Badge status="success" />Finished</span> },
            {
                title: '角色名', dataIndex: 'roleName', key: 'roleName',
            },
            {
                title: '角色状态', dataIndex: 'roleState', key: 'roleState',
                render: (text, record) => this.renderColumns(text, record, 'roleState', true)
            },
            {
                title: '到期时间', dataIndex: 'expireDate', key: 'expireDate',
                render: (text, record) => this.renderColumns(text, record, 'userCode', true)
            },
            {title: '备注', dataIndex: 'desc', key: 'desc'},
            {
                title: '更新时间', dataIndex: 'updateTime', key: 'updateTime',
                render: (text, record) => this.renderColumns(text, record, 'updateTime', true)
            },
            {
                title: '操作人', dataIndex: 'updateName', key: 'updateName',
                render: (text, record) => this.renderColumns(text, record, 'updateName', true)
            },
            {
                title: '操作', dataIndex: 'operation',
                render: (text, record) => {
                    const { editable } = record;
                    return (
                        <div className="editable-row-operations">
                            {editable ? (
                                <span>
                                    <a onClick={(e) => this.save(e, record.roleName)}>保存 </a>
                                    <Popconfirm
                                        title="Sure to cancel?"
                                        onConfirm={(e) => this.cancel(e, record.roleName)}
                                        onCancel={(e) => {e.stopPropagation()}}
                                    >
                                        <a onClick={(e) => {e.stopPropagation()}}>取消</a>
                                    </Popconfirm>
                                </span>
                            ) : (
                                <span>
                                    <a onClick={(e) => this.edit(e, record.roleName)}>信息修改</a> <br />
                                    <a onClick={(e) => this.edit(e, record.roleName)}>查看权限</a> <br />
                                </span>
                            )}
                        </div>
                    );
                },
            },
        ];

        this.state = {
            editRow:'',
            data: []
        };

        this.cacheData = [];
    }

    renderColumns(text, record, column, changeEnable) {
        let editable = record.id == this.state.editRow;
        return (
            <EditableCell
                editable={editable}
                changeEnable={changeEnable}
                value={text}
                onChange={value => this.handleChange(value, record.roleName, column)}
            />
        );
    }

    handleChange(value, roleName, column) {
        const newData = [...this.state.data];
        const target = newData.filter(item => roleName === item.roleName)[0];
        if (target) {
            target[column] = value;
            this.setState({data: newData});
        }
    }

    edit(e, roleName) {
        e.stopPropagation();
        const newData = [...this.state.data];
        const target = newData.filter(item => roleName === item.roleName)[0];
        if (target) {
            target.editable = true;
            this.setState({data: newData});
        }
    }

    save(e, roleName) {
        e.stopPropagation();
        const newData = [...this.state.data];
        const target = newData.filter(item => roleName === item.roleName)[0];
        if (target) {
            delete target.editable;
            this.setState({data: newData});
            this.cacheData = newData.map(item => ({...item}));
        }
    }

    cancel(e, roleName) {
        e.stopPropagation();
        const newData = [...this.state.data];
        const target = newData.filter(item => roleName === item.roleName)[0];
        if (target) {
            Object.assign(target, this.cacheData.filter(item => roleName === item.roleName)[0]);
            delete target.editable;
            this.setState({data: newData});
        }
    }

    render() {
        const { data} = this.props;
        this.state = {data};
        return <Table rowKey={record => record.roleName}
                      columns={this.columns}
                      dataSource={data}
                      pagination={false}
                      indentSize={0}
        />;
    }

}



