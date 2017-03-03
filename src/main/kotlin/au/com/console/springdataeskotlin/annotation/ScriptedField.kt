package au.com.console.springdataeskotlin.annotation

/**
 * Created on 18/11/16.
 * @author Ryan Murfitt (ryan.murfitt@console.com.au)
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class ScriptedField(val name: String = "")