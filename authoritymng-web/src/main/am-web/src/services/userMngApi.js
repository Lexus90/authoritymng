import request from '@/utils/request';
import {getURI} from "../utils/utils";

const URI = getURI();

export async function queryUser() {
    return request(`${URI}/api/users`);
}

export async function listUserPage(params) {
    let {current, pageSize, userCode} = params;
    userCode = !!userCode ? userCode : '';
    return request(`${URI}/api/AmUser/all/${current}/${pageSize}?userCode=${userCode}`);
}
