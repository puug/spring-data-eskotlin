package au.com.console.springdataeskotlin

import au.com.console.springdataeskotlin.annotation.ParentId
import org.junit.Assert.assertEquals
import org.junit.Test
import org.springframework.data.annotation.Id

/**
 * Created on 12/2/17.
 * @author Ryan Murfitt (ryan.murfitt@console.com.au)
 */

class A(@Id val id: Int,
        @ParentId val parentId: Int,
        val desc: String)

class ReflectionUtilsTest {

    @Test
    fun `id property`() {
        assertEquals(A::class.idProperty, A::id)
    }

    @Test
    fun `ParentId property`() {
        assertEquals(A::class.parentIdProperty, A::parentId)
    }
}
