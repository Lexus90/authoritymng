import request from '@/utils/request';
import {getURI} from "../utils/utils";

const URI = getURI();

export async function queryUser() {
    return request(`${URI}/api/users`);
}

export async function listUserPage(params) {
    let {pageNum, pageSize} = params;
    return request(`${URI}/api/AmUser/all/${pageNum}/${pageSize}`);
}
