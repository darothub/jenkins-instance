pipelineJob('pipelineJob'){
    definition{
        cps{
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('clientServiceJob'){
    definition{
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/darothub/microservice-springboot.git'
                    }
                    branch 'develop'
                }
            }
        }
    }
}