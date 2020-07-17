package com.DesignPattern.CompositePattern.transparencyDemo;

/**
 * Composite Pattern 组合模式 Demo: 透明模式
 */
public class TransparencyCompositePatternDemo {
    public static void main(String[] args) {
        Folder root = new Folder("863重点项目");

        // 添加一级节点(文件/文件夹)
        File file1 = new File("README.md");
        File file2 = new File("LICENSE.txt");
        Folder folderC = new Folder("C代码");
        Folder folderJava = new Folder("Java代码");
        root.add(file1);
        root.add(file2);
        root.add(folderC);
        root.add(folderJava);

        // 向 <C代码> 文件夹添加C源码文件
        File fileC1 = new File("main.c");
        File fileC2 = new File("test.c");
        folderC.add(fileC1);
        folderC.add(fileC2);

        // 向 <Java代码> 文件夹添加Java源码文件
        File fileJava1 = new File("webSocketServer.java");
        File fileJava2 = new File("tcpServer.java");
        File fileJava3 = new File("updServer.java");
        folderJava.add(fileJava1);
        folderJava.add(fileJava2);
        folderJava.add(fileJava3);

        // 遍历该目录下的全部节点(文件/文件夹)
        System.out.println("基于透明模式的组合模式");
        showTree(root);
    }

    /**
     * 遍历该文件夹下的全部节点(文件/文件夹)
     * @param root
     */
    public static void showTree(FileSystem root) {
        for( FileSystem fileSystem : root.getChildren() ) {
            fileSystem.getInfo();
            if( fileSystem instanceof Folder) {
                showTree(fileSystem);
            }
        }
    }
}
