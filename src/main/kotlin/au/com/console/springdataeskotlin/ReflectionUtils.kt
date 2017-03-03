package au.com.console.springdataeskotlin

import au.com.console.springdataeskotlin.annotation.ParentId
import org.springframework.data.annotation.Id
import java.lang.reflect.ParameterizedType
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1
import kotlin.reflect.declaredMemberProperties
import kotlin.reflect.jvm.javaField

/**
 * Created on 12/2/17.
 * @author Ryan Murfitt (ryan.murfitt@console.com.au)
 */

val <T : Any> KClass<T>.idProperty: KProperty1<T, *>?
    get() = this.propertyForAnnotation(Id::class)

val <T : Any> KClass<T>.parentIdProperty: KProperty1<T, *>?
    get() = this.propertyForAnnotation(ParentId::class)

fun <T : Any> KClass<T>.propertyForAnnotation(annotation: KClass<out Annotation>): KProperty1<T, *>? =
        this.declaredMemberProperties.first {
            it.javaField!!.isAnnotationPresent(annotation.java)
            it.javaClass.genericSuperclass is ParameterizedType
        }



