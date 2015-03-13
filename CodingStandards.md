# Syntax #

  * Code for Java 1.5 compatibility.

  * Use CamelCase for just about everything, i.e. lowerFollowedByUpperCase names for variables and methods. Class names BeginWithUpperCaseAndContinueUsingUpperCase. Constants use ALL\_UPPER\_CASE\_WITH\_UNDERSCORES.

  * Use hard tabs, not spaces. You may need to configure your editor to do this.

  * One class per `.java` file.

  * Block notation and indentation are as follows:

```
begin a block {
   performOperations();
}
```

  * Most variables will be private. Use get and set methods for them. A typical method of access for a variable x is:

```
public class Data {
   int x;

   public void setX(int i) {
      x=i;
   }

   public int getX() {
      return x;
   }
}
```

# Files #

  * Remove .class files before syncing to the Subversion repository.

  * Remove temporary files (e.g. ~Skin.java, 229283847.tmp) created by your text editor before syncing.

  * Use Unix (LF) line endings and UTF8 encoding.