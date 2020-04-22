import data.Student
import data.studentList
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.li
import react.dom.ol

interface RStudentProps : RProps{
	var student: ArrayList<Student>
}

class RStudent : RComponent<RStudentProps, RState>() {
	override fun RBuilder.render(){
		ol {
			studentList.map{
				li {
					+"${it.firstname} ${it.surname}"
				}
			}
		}
	}
}

fun RBuilder.rstudent(student:ArrayList<Student>) =
		child(RStudent::class){
			attrs.student = student
		}