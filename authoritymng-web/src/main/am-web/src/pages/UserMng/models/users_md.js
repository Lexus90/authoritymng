import {listUserPage, queryUser} from "../../../services/userMngApi";

export default {
  namespace: 'users_md',

  state: {
    users: {
      list: [],
      pagination: {
          total: 50,
          current:0,
          pageSize:10,
      },
      roles:[]
    }
  },

  effects: {
    *listPage({ payload }, { call, put }) {
        let resp = yield call(listUserPage, payload);
        let {code, data} = resp;
        if (code == 200) {
            yield put({
                type: "LIST_USER",
                payload: data,
            });
        }

    },

  },

  reducers: {
      LIST_USER(state, action) {
          let {total, current, pageSize } =action.payload
          return {
              ...state,
              users: {
                  list:action.payload.list,
                  pagination:{total},
              },
          };
      },

  },

};
