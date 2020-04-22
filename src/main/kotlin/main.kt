import data.studentList
import react.dom.h1
import react.dom.render
import kotlin.browser.document


fun main(args: Array<String>) {
    render(document.getElementById("root")!!){
        h1{
            +"Student"
        }
                    rstudent(studentList)

        }
    }

