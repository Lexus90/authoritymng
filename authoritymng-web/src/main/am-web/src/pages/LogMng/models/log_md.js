import {listUserPage, queryUser} from "../../../services/userMngApi";

export default {
  namespace: 'users_md',

  state: {
    user: {
      list: [],
      pagination: {
          pageNum:0,
          pageSize:10,
      },
    }
  },

  effects: {
    *listPage({ payload }, { call, put }) {
        let resp = yield call(listUserPage, payload);
        yield put({
            type: "LIST_USER",
            payload: resp,
        });
    },

  },

  reducers: {
      LIST_USER(state, action) {
          return {
              ...state,
              user: action.payload,
          };
      },

  },

};
