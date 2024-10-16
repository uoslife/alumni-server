package uoslife.alumniserver

import io.github.cdimascio.dotenv.Dotenv
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AlumniServerApplication

fun main(args: Array<String>) {
    initEnv()
    runApplication<AlumniServerApplication>(*args)
}

/**
 * 스프링 부트 실행 전 시스템 속성(System Properties)을 설정한다.
 */
fun initEnv() {
    val dotenv = Dotenv.configure()
        .directory("./")
        .filename(".env")
        .load()

    dotenv.entries().forEach { entry ->
        System.setProperty(entry.key, entry.value)
    }
}
