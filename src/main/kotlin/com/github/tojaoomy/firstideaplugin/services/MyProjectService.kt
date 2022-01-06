package com.github.tojaoomy.firstideaplugin.services

import com.intellij.openapi.project.Project
import com.github.tojaoomy.firstideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
