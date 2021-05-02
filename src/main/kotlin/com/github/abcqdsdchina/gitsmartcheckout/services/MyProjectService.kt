package com.github.abcqdsdchina.gitsmartcheckout.services

import com.github.abcqdsdchina.gitsmartcheckout.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
