//登录服务端
app.service('loginService',function($http){
    //读取登人名称

    this.loginName=function(){
        return $http.get('../login/loginName.do');
    }
});