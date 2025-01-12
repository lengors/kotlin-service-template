package io.github.lengors.kotlinservicetemplate

import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun `should correctly display hello world message`() {
        val stdOut = System.out
        val streamCaptor = ByteArrayOutputStream()
        PrintStream(streamCaptor).use {
            System.setOut(it)
            main()
            System.setOut(stdOut)
        }

        assertEquals(
            "Hello, World!",
            streamCaptor
                .toString()
                .trim(),
        )
    }
}
