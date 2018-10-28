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
                render: (text, record) => this.renderColumns(text, record, 'um', true)
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
            data: []
        };

        this.cacheData = [];
    }

    renderColumns(text, record, column, changeEnable) {
        return (
            <EditableCell
                editable={record.editable}
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
                    const { editable } = record;
                    return (
                        <div className="editable-row-operations">
                            {editable ? (
                                <span>
                                    <a onClick={(e) => this.save(e, record)}>保存 </a>
                                    <Popconfirm
                                        title="Sure to cancel?"
                                        onConfirm={(e) => this.cancel(e, record.um)}
                                        onCancel={(e) => {e.stopPropagation()}}
                                    >
                                        <a onClick={(e) => {e.stopPropagation()}}>取消</a>
                                    </Popconfirm>
                                </span>
                            ) : (
                                <span>
                                    <a onClick={(e) => this.edit(e, record.um)}>修改</a> <br />
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
            subData:[]
        };

        this.cacheData = [];
    }
    renderColumns(text, record, column, changeEnable) {
        return (
            <EditableCell
                editable={record.editable}
                changeEnable={changeEnable}
                value={text}
                onChange={value => this.handleChange(value, record.um, column)}
            />
        );
    }
    handleChange(value, um, column) {
        const newData = [...this.state.data];
        const target = newData.filter(item => um === item.um)[0];
        if (target) {
            target[column] = value;
            this.setState({ data: newData });
        }
    }
    edit(e, um) {
        e.stopPropagation();
        const newData = [...this.state.data];
        const target = newData.filter(item => um === item.um)[0];
        if (target) {
            target.editable = true;
            this.setState({ data: newData });
        }
    }
    save(e, userInfo) {
        e.stopPropagation();

        const newData = [...this.state.data];
        const target = newData.filter(item => userInfo.um === item.um)[0];
        if (target) {
            delete target.editable;
            this.setState({ data: newData });
            this.cacheData = newData.map(item => ({ ...item }));
        }

        this.props.dispatch({
            type: 'users/updateUser',
            payload: userInfo,
        });

    }

    deleteUser(e, userInfo) {
        e.stopPropagation();

        const newData = [...this.state.data];
        const target = newData.filter(item => userInfo.um === item.um)[0];
        if (target) {
            delete target.editable;
            this.setState({ data: newData.filter(item => userInfo.um !== item.um) });
            this.cacheData = newData.filter(item => userInfo.um !== item.um);
        }

        this.props.dispatch({
            type: 'users/deleteUser',
            payload: userInfo,
        });

    }
    cancel(e, um) {
        e.stopPropagation();
        const newData = [...this.state.data];
        const target = newData.filter(item => um === item.um)[0];
        if (target) {
            Object.assign(target, this.cacheData.filter(item => um === item.um)[0]);
            delete target.editable;
            this.setState({ data: newData });
        }
    }

    expandedRowRender(record) {

        const {roleList : subData} = record;

        return (<UserRoleTable
            data = {subData}
        />);
    }
    render() {
        const { dataSource, pagination, subData } = this.props;
        // this.state = {data, subData};
        return <Table rowKey={record => record.userCode}
                      dataSource={dataSource}
                      pagination={pagination}
                      expandedRowRender = {this.expandedRowRender}
                      columns={this.columns}
                      expandRowByClick = {true} e
                      xpandIconAsCell = {false} />;
    }
}

@connect(({ users_md, loading }) => ({
    // loading: loading.effects['users/queryList'],
    users_md,
    users: users_md.users,
    loading: loading.models.users_md,
}))
export default class UserMng extends PureComponent {
    constructor(props) {
        super(props);
    }

  componentDidMount() {
      const { dispatch } = this.props;
      dispatch({
          type: 'users_md/listPage',
          payload:{
              pageNum:0,
              pageSize:10,
          }
      });
  }

  render() {
    const { location, route, users:{list, pagination}} = this.props;
    return (
      <PageHeaderWrapper
        title={route.name}
        tabActiveKey={location.pathname}
        content={route.name}
      >

        <Card title="用户列表" style={{ marginBottom: 24 }} bordered={false}>
          <EditableTable
              dataSource = {!!list ? list : []}
              pagination = {pagination}
          />

          {/*subData = {}*/}
        </Card>
      </PageHeaderWrapper>
    );
  }
}
