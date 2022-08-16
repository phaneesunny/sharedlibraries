def newgit(repo)
{
 git"${repo}"
}
def newbuild()
{
 sh 'mvn package'
}
def newdeploy(ip,appname)
{
 deploy adapters: [tomcat9(credentialsId: '2e6bf8d6-9b91-4075-b423-e966f305338f', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
def newtest(workspace)
{
 sh "java -jar /root/.jenkins/workspace/${workspace}/testing.jar"
}
