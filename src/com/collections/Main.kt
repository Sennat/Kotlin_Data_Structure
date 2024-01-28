import com.collections.Collections
import com.collections.CreateProject

fun main(args : Array<String>) {
    val collection = Collections()
    val createProject = CreateProject()

    collection.iterateData()
    //collection.mapData().toString()
    //collection.flatMapData()
    //collection.filterData()
    //collection.sortData()
    createProject.createProject().forEach { println(it) }

}