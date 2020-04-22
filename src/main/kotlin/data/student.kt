package data

data class Student(
    val firstname:String,
    val surname:String
)
var studentList =
    arrayListOf(
        Student("Sheldon", "Cooper"),
        Student("Leonard", "Hofstadter"),
        Student("Howard", "Wolowitz"),
        Student("Maksim", "Shanin")
    )
