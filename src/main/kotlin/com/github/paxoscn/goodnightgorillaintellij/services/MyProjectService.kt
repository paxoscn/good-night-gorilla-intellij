package com.github.paxoscn.goodnightgorillaintellij.services

import com.intellij.openapi.project.Project
import com.github.paxoscn.goodnightgorillaintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
