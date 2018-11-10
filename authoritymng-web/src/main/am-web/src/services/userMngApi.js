import request from '@/utils/request';
import { URI} from "../utils/utils";

export async function queryUser() {
    return request(`${URI}/api/users`);
}

export async function listUserPage(params) {
    let {current, pageSize, userCode} = params;
    userCode = !!userCode ? userCode : '';
    return request(`${URI}/api/AmUser/all/${current}/${pageSize}?userCode=${userCode}`);
}
