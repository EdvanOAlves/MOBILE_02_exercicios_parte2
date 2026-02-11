package lista_1_parte_2.model

class Manager(name:String, salary:Float):Employee(name, salary){
    override var salary: Float = salary
        get() = field *1.2F
    //Override de gets acaba sendo meio diferente, por padrão toda variável já recebe um get e set, nesse caso o getSalary
    //já existe e não pode ser sobescrito, então para resolver isso precisamos dar um override da própria variável e aqui
    //dizer que o get que queremos é diferente
}