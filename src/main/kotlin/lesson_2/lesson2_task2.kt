package lesson_2

fun main() {
    val numberOfEmployees = 50
    val employeeSalary = 30000

    val numberOfTrainees = 30
    val traineeSalary = 20000

    val permanentEmployeesExpenses = numberOfEmployees * employeeSalary
    val totalSalaryExpenses = numberOfTrainees * traineeSalary + permanentEmployeesExpenses
    val totalNumberOfEmployees = numberOfEmployees + numberOfTrainees
    val averageEmployeeSalary = totalSalaryExpenses / totalNumberOfEmployees


    println(permanentEmployeesExpenses)
    println(totalSalaryExpenses)
    println(averageEmployeeSalary)

}