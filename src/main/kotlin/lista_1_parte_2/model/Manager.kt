package lista_1_parte_2.model

class Manager(name:String, salary:Float):Employee(name, salary){
    override fun getSalary(): Float{
        return (salary*1.20F)
    }
}