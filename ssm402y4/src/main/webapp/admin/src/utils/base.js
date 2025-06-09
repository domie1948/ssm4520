const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm402y4/",
            name: "ssm402y4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm402y4/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "教师工作考核绩效管理系统"
        } 
    }
}
export default base
