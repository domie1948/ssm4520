import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/shijuanliebiao/exam'
    import jixiaokaohe from '@/views/modules/jixiaokaohe/list'
    import xueshengliuyan from '@/views/modules/xueshengliuyan/list'
    import jiaoshixinxi from '@/views/modules/jiaoshixinxi/list'
    import xitonggonggao from '@/views/modules/xitonggonggao/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueshengpingjiao from '@/views/modules/xueshengpingjiao/list'
    import dudao from '@/views/modules/dudao/list'
    import jiaoshiliuyan from '@/views/modules/jiaoshiliuyan/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import xueyuan from '@/views/modules/xueyuan/list'
    import liuyanxinxi from '@/views/modules/liuyanxinxi/list'
    import dudaopingjia from '@/views/modules/dudaopingjia/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/jixiaokaohe',
        name: '绩效考核',
        component: jixiaokaohe
      }
          ,{
	path: '/xueshengliuyan',
        name: '学生留言',
        component: xueshengliuyan
      }
          ,{
	path: '/jiaoshixinxi',
        name: '教师信息',
        component: jiaoshixinxi
      }
          ,{
	path: '/xitonggonggao',
        name: '系统公告',
        component: xitonggonggao
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/xueshengpingjiao',
        name: '学生评教',
        component: xueshengpingjiao
      }
          ,{
	path: '/dudao',
        name: '督导',
        component: dudao
      }
          ,{
	path: '/jiaoshiliuyan',
        name: '教师留言',
        component: jiaoshiliuyan
      }
          ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
          ,{
	path: '/xueyuan',
        name: '学院',
        component: xueyuan
      }
          ,{
	path: '/liuyanxinxi',
        name: '留言信息',
        component: liuyanxinxi
      }
          ,{
	path: '/dudaopingjia',
        name: '督导评价',
        component: dudaopingjia
      }
        ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
