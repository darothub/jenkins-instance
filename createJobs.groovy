pipelineJob('pipelineJob'){
    definition{
        cps{
            script(readFileFromWorkSpace('pipelineJob.groovy'))
            sandbox()
        }
    }
}