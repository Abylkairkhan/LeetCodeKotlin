class Student(private var surname: String, private var lastname: String, private var id: String,
              private var year: Int, private var myCourses: List<String>) {
    constructor(surname: String, lastname: String): this(surname, lastname, "21B000000", 1, listOf("asd"))

    fun takeCourse(courseName: String){
        this.myCourses
    }

    fun getSurname(): String{
        return surname
    }
    fun getLastname(): String{
        return lastname
    }
    fun getID(): String{
        return id
    }
    fun getYear(): Int{
        return year
    }
}