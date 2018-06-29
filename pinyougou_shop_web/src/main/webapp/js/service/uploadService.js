app.service('uploadService',function ($http) {
    this.uploadFile=function () {
        //H5的对象 表单对象
        var formData=new FormData();
        //<input type="file" name="file" id="file">
        //File 是H5中文件对象 就是选中的文件本身

        //file.files[]  中的file 就是 input 对应的ID 还可以通过document.getElementByID("file")
        //
        formData.append("file",file.files[0]);//file=File
        return $http({
            method:'POST',
            url:"../upload.do",
            data: formData,
            //设置头：必须是多媒体文件类型 entyp-type="mult-data"
            headers: {'Content-Type':undefined},//会默认使用多媒体类型
            transformRequest: angular.identity //使用angularjs的序列化请求方式
        });
    }
})