import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class N1233_RemoveSubFoldersFromTheFileSystem_Test {

    @Test
    fun removeSubfolders_Test1() {
        val folder = arrayOf("/a", "/a/b", "/c/d", "/c/d/e", "/c/f")
        assertThat(N1233_RemoveSubFoldersFromTheFileSystem().removeSubfolders(folder))
            .containsExactly("/a", "/c/d", "/c/f")
    }

    @Test
    fun removeSubfolders_Test2() {
        val folder = arrayOf("/a", "/a/b/c", "/a/b/d")
        assertThat(N1233_RemoveSubFoldersFromTheFileSystem().removeSubfolders(folder)).containsExactly("/a")
    }

    @Test
    fun removeSubfolders_Test3() {
        val folder = arrayOf("/a/b/c", "/a/b/ca", "/a/b/d")
        assertThat(N1233_RemoveSubFoldersFromTheFileSystem().removeSubfolders(folder))
            .containsExactly("/a/b/c", "/a/b/ca", "/a/b/d")
    }
}