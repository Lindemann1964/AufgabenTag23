fun main() {
    val shoppingList: MutableList<String> = mutableListOf(
        "Reis", "Tofu", "Brokkoli", "Nudeln", "Apfelsaft",
        "Zitronen", "Eis", "Erdbeeren", "Torte"
    )
    for (i in 0.. shoppingList.size -1){
        shoppingList[i] = (i+1).toString()+ "." +  shoppingList[i]

    }

    println(shoppingList)
}
var name: String = "Keanu"
var alter: Int = 21
var nameUndAlter = alter.toString() + name