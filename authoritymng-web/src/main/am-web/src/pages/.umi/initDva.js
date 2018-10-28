import dva from 'dva';
import createLoading from 'dva-loading';

const runtimeDva = window.g_plugins.mergeConfig('dva');
let app = dva({
  history: window.g_history,
  
  ...(runtimeDva.config || {}),
});

window.g_app = app;
app.use(createLoading());
(runtimeDva.plugins || []).forEach(plugin => {
  app.use(plugin);
});

app.model({ namespace: 'global', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/models/global.js').default) });
app.model({ namespace: 'list', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/models/list.js').default) });
app.model({ namespace: 'login', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/models/login.js').default) });
app.model({ namespace: 'project', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/models/project.js').default) });
app.model({ namespace: 'setting', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/models/setting.js').default) });
app.model({ namespace: 'user', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/models/user.js').default) });
app.model({ namespace: 'register', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/User/models/register.js').default) });
app.model({ namespace: 'activities', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/Dashboard/models/activities.js').default) });
app.model({ namespace: 'chart', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/Dashboard/models/chart.js').default) });
app.model({ namespace: 'monitor', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/Dashboard/models/monitor.js').default) });
app.model({ namespace: 'form', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/Forms/models/form.js').default) });
app.model({ namespace: 'rule', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/List/models/rule.js').default) });
app.model({ namespace: 'profile', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/Profile/models/profile.js').default) });
app.model({ namespace: 'error', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/Exception/models/error.js').default) });
app.model({ namespace: 'geographic', ...(require('/Users/caowei/code/java/authoritymng/authoritymng-web/src/main/am-web/src/pages/Account/Settings/models/geographic.js').default) });
