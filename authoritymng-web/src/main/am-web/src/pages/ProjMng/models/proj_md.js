import {listUserPage, queryUser} from "../../../services/userMngApi";

export default {
  namespace: 'proj_md',

  state: {
      appId:0,
      projList:[]
  },

  effects: {
    *listAll({ payload }, { call, put }) {
        let resp = yield call(listUserPage, payload);
        yield put({
            type: "LIST_All",
            payload: resp,
        });
    },

  },

  reducers: {
      LIST_All(state, action) {
          return {
              ...state,
              user: action.payload,
          };
      },

  },

};
