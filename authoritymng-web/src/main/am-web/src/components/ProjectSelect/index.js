import React, { PureComponent } from 'react';
import PropTypes from 'prop-types';
import { Select } from 'antd';
import { connect } from 'dva';
import {getAppId, refreshAppId, setAppId} from "../../utils/utils";

const { Option } = Select;

class ProjectSelect extends PureComponent {
    static defaultProps = {
        projectList: [],
    };
    static propTypes = {
        projectList: PropTypes.array,
    };

    constructor(props) {
        super(props);
    }

    componentDidMount() {
        refreshAppId(this.props.appId);
    }

    handleChange = appId => {

        const { projectList } = this.props;
        if (!!projectList && projectList.length > 0) {
            setAppId(appId);
            const projectInfo = projectList.filter(proj => {
                if (proj.app_id === appId) return proj;
            })[0];
            this.changeProject(projectInfo);
        }

    };

    changeProject(projectInfo) {

        this.props.dispatch({
            type: 'projects/changeProjectSelect',
            payload: projectInfo,
        });

    }

    render() {
        const { projectList, currentProjectId } = this.props;
        const appId = currentProjectId;

        return (
            <span>
                切换项目：
                <Select
                    defaultValue={appId == -1 ? '' : Number(appId)}
                    value={Number(appId)}
                    showSearch
                    style={{ width: 200 }}
                    placeholder="选择一个项目"
                    optionFilterProp="children"
                    onChange={this.handleChange}
                    filterOption={(input, option) =>
                        option.props.children.toLowerCase().indexOf(input.toLowerCase()) >= 0
                    }
                >
                    {projectList.map((Item, index) => {
                        return (
                            <Option key={Item.app_id} value={Item.app_id}>
                                {Item.name}
                            </Option>
                        );
                    })}
                </Select>
            </span>
        );
    }
}

export default connect(({ proj_md }) => ({
    projList: proj_md.projList,
    appId: proj_md.appId,
    proj_md,
}))(ProjectSelect);
