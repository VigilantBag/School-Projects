# lab 4

```java
public class App {

    static char[][] dealwithit(){
        char[][] art = new char[37][42];
        art[0][1] = ' ';
        art[0][2] = art[0][3] = art[1][1] = art[0][4] = art[0][5] = art[0][6] = art[0][7] = art[0][8] = art[0][9] = art[0][10] = art[0][11] = art[0][12] = art[0][13] = art[0][14] = art[0][15] = art[0][16] = art[0][17] = art[0][18] = art[0][19] = art[0][20] = art[0][21] = art[0][22] = art[0][23] = art[0][24] = art[0][25] = art[0][26] = art[0][27] = art[0][28] = art[0][29] = art[0][30] = art[0][31] = art[0][32] = art[0][33] = art[1][9] = art[1][14] = art[1][15] = art[1][16] = art[1][17] = art[1][21] = art[1][27] = art[1][28] = art[1][29] = art[1][30] = art[2][11] = art[2][13] = art[2][23] = art[2][26] = art[2][28] = '█';
        art[0][34] = art[1][2] = art[1][3] = art[1][4] = art[1][5] = art[1][6] = art[1][7] = art[1][18] = art[1][19] = art[1][20] = art[1][31] = art[1][32] = art[1][33] = art[2][1] = art[2][2] = art[2][3] = art[2][4] = art[2][5] = art[2][6] = art[2][7] = art[2][8] = art[2][9] = art[2][16] = art[2][17] = art[2][18] = art[2][19] = art[2][20] = art[2][21] = art[2][22] = art[2][29] = art[2][30] = art[2][31] = art[2][32] = art[2][33] = ' ';
        art[1][8]  = art[1][11] = art[1][13] = art[1][24] = art[1][26] = art[1][17] = art[1][21] = art[1][30] = art[2][10] = art[2][15] = art[2][23] = art[2][28] = '▀';
        art[1][10] = art[1][12] = art[1][23] = art[1][25] = art[2][12] = art[2][14] = art[2][25] = art[2][27] = '▄';
        return art;

    }
    public static void main(String[] args){
        System.out.println("Inefficiency. Deal with it.\n");
        char[][] arr = dealwithit();
        for(int i=0; i<3; i++){
            System.out.println();
            for(int j=0; j<34; j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
```

```text
Inefficiency. Deal with it.


 ████████████████████████████████
█      ▀█▄▀▄▀███▀   ▀▄▀▄▀███▀
         ▀█▄█▄▀       ▀▄█▄▀
```
