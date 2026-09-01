rootProject.name = "pgk-champs-ide-course"

// Каждая папка задания (там, где есть src/) — отдельный Gradle-модуль.
// Так же собирает курс сам плагин JetBrains Academy — см. kotlin-course-template.
rootProject.projectDir.walkTopDown().forEach { dir ->
    if (dir.path.contains(".idea") || dir.path.contains("build") || dir.path.contains(".git")) {
        return@forEach
    }
    if (!File(dir, "src").exists()) {
        return@forEach
    }
    val relative = rootDir.toPath().relativize(dir.toPath())
    val moduleName = relative.joinToString("-") { it.toString() }
    include(moduleName)
    project(":$moduleName").projectDir = dir
}
