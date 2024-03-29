package com.blend.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class BlendPlugin implements Plugin<Project> {

    // 实现apply方法，注入插件的逻辑
    void apply(Project project) {

        println "<--->I am form BlendPlugin,apply form ${project.name}"

        project.getExtensions().create("blendParam", BlendExtension)

        project.afterEvaluate {
            BlendExtension extension = project["blendParam"]
            println "<--->plugin User's root path is:${extension.rootPath}"
        }
    }
}