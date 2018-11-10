import request from '@/utils/request';
import {URI} from "../utils/utils";

export async function login() {
    return request(`${URI}/api/login`);
}

export async function logout() {
    return request('/api/currentUser');
}
