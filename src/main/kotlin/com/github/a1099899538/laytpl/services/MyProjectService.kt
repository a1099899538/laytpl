package com.github.a1099899538.laytpl.services

import com.intellij.openapi.project.Project
import com.github.a1099899538.laytpl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
