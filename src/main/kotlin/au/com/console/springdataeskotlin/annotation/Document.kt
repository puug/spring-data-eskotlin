package au.com.console.springdataeskotlin.annotation

/**
 * Created on 17/11/16.
 * @author Ryan Murfitt (ryan.murfitt@console.com.au)
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
annotation class Document(val indexName: String,
                          val type: String,
                          val searchTypes: Array<String> = arrayOf())