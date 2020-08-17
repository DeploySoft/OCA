/*
Check that here in the first line you could find the class comments or
if you're using package then it should be the first/second statement on a class.
Additional when you're using import statement for any reason the correct order must be
package,import, class declaration.
 */
package JavaBasics;

/*
 * For import they valid used
 * import JavaBasics.Imports.LvL1Import;
 * import JavaBasics.Imports.SubImport.LvLNImport;
 * or
 * import JavaBasics.Imports.*; //you'll import just the classes on  "Imports" package but don't other classes packages
 * import JavaBasics.Imports.SubImport.*;
 */


public class Modifiers {
    /**
     * static public void main(String[] args)
     * or
     * public static void main(String[] args)
     * both are valid for declaring; You could change in Java the access and non access
     * modifiers but never could change order for return type
     */
    public static void main(String[] args) {

    }

}


/*
        +----------------+------------+--------------+------------+----------+
        |Access modifier |   Class    |   Package    |  Subclass  |  Global  |
        |                |            |              |            |          |
        +--------------------------------------------------------------------+
        |public          |    yes     |     yes      |    yes     |    yes   |
        |                |            |              |            |          |
        |protected       |    yes     |     yes      |    yes     |    no    |
        |                |            |              |            |          |
        |default         |    yes     |     yes      |    no      |    no    |
        |                |            |              |            |          |
        |private         |    yes     |     no       |    no      |    no    |
        |                |            |              |            |          |
        |----------------+------------+--------------+------------+----------+
*/

/*
 * Non Access modifiers
 * static
 * final
 * abstract
 * synchronized
 * volatile
 * */
