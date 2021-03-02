package com.github.chinaltz.mvparttemplate.services

import com.github.chinaltz.mvparttemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
