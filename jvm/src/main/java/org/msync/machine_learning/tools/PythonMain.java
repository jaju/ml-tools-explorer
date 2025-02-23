package org.msync.machine_learning.tools;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import static java.lang.foreign.MemorySegment.NULL;
import static org.python.Python_h.*;

public class PythonMain {
    
    public static void main(String[] args) {
        String myString = "Hello world!";
        String script = """
                     string = "%s"
                     print(string, ': ', len(string), sep='')
                     """.formatted(myString).stripIndent();
        Py_Initialize();
        
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment nativeString = arena.allocateFrom(script);
            PyRun_SimpleStringFlags(
                nativeString,
                NULL);
            Py_Finalize();
        }
        Py_Exit(0);
    }
}
