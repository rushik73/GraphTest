import java.util.*;
//Name:Rushik Guduru
//NetID: rxg200049


public class GraphTest {


    public void shortestPath(int[][] distanceMatrix) {
        Vertex[] vertexArray = new Vertex[48];
        for (int i = 0; i < 48; i++) {
            vertexArray[i] = new Vertex();
        }
        vertexArray[0].distance = 0;


        for (int i = 0; i < 48; i++) {
            int minDistance = Integer.MAX_VALUE;
            int currentVertex = -1;


            for (int v = 0; v < 48; v++) {
                if (!vertexArray[v].known && vertexArray[v].distance < minDistance) {
                    minDistance = vertexArray[v].distance;
                    currentVertex = v;
                }
            }


            for (int j = 0; j < 48; j++) {
                if (!vertexArray[j].known && distanceMatrix[currentVertex][j] != 0) {
                    int newDistance = vertexArray[currentVertex].distance + distanceMatrix[currentVertex][j];
                    if (newDistance < vertexArray[j].distance) {
                        vertexArray[j].distance = newDistance;
                        vertexArray[j].previousVertex = currentVertex;
                    }
                }
            }


            vertexArray[currentVertex].known = true;
        }

        for (int i = 0; i < 48; i++) {
            System.out.println("The shortest distance between state[0] and state[" + i + "] is: " + vertexArray[i].distance);
        }
    }

    public static void main(String args[]) {

        int[][] distanceMatrix = new int[48][48];
        distanceMatrix[0][4] = distanceMatrix[4][0] = 755;
        distanceMatrix[0][1] = distanceMatrix[1][0] = 129;
        distanceMatrix[0][2] = distanceMatrix[2][0] = 535;
        distanceMatrix[1][4] = distanceMatrix[4][1] = 713;
        distanceMatrix[1][5] = distanceMatrix[5][1] = 534;
        distanceMatrix[1][6] = distanceMatrix[6][1] = 541;
        distanceMatrix[1][2] = distanceMatrix[2][1] = 663;
        distanceMatrix[2][6] = distanceMatrix[6][2] = 441;
        distanceMatrix[2][3] = distanceMatrix[3][2] = 160;
        distanceMatrix[3][6] = distanceMatrix[6][3] = 619;
        distanceMatrix[4][7] = distanceMatrix[7][4] = 476;
        distanceMatrix[4][5] = distanceMatrix[5][4] = 652;
        distanceMatrix[5][8] = distanceMatrix[8][5] = 488;
        distanceMatrix[5][9] = distanceMatrix[9][5] = 435;
        distanceMatrix[5][6] = distanceMatrix[6][5] = 338;
        distanceMatrix[6][9] = distanceMatrix[9][6] = 727;
        distanceMatrix[6][10] = distanceMatrix[10][6] = 438;
        distanceMatrix[7][11] = distanceMatrix[11][7] = 697;
        distanceMatrix[7][12] = distanceMatrix[12][7] = 585;
        distanceMatrix[7][8] = distanceMatrix[8][7] = 355;
        distanceMatrix[8][12] = distanceMatrix[12][8] = 626;
        distanceMatrix[8][13] = distanceMatrix[13][8] = 536;
        distanceMatrix[8][14] = distanceMatrix[14][8] = 486;
        distanceMatrix[8][9] = distanceMatrix[9][8] = 100;
        distanceMatrix[9][14] = distanceMatrix[14][9] = 444;
        distanceMatrix[9][15] = distanceMatrix[15][9] = 455;
        distanceMatrix[9][10] = distanceMatrix[10][9] = 675;
        distanceMatrix[10][15] = distanceMatrix[15][10] = 742;
        distanceMatrix[10][16] = distanceMatrix[16][10] = 624;
        distanceMatrix[11][17] = distanceMatrix[17][11] = 430;
        distanceMatrix[11][18] = distanceMatrix[18][11] = 504;
        distanceMatrix[11][12] = distanceMatrix[12][11] = 388;
        distanceMatrix[12][18] = distanceMatrix[18][12] = 337;
        distanceMatrix[12][19] = distanceMatrix[19][12] = 416;
        distanceMatrix[12][13] = distanceMatrix[13][12] = 293;
        distanceMatrix[13][19] = distanceMatrix[19][13] = 204;
        distanceMatrix[13][14] = distanceMatrix[14][13] = 165;
        distanceMatrix[14][19] = distanceMatrix[19][14] = 343;
        distanceMatrix[14][20] = distanceMatrix[20][14] = 187;
        distanceMatrix[14][15] = distanceMatrix[15][14] = 392;
        distanceMatrix[15][20] = distanceMatrix[20][15] = 490;
        distanceMatrix[15][21] = distanceMatrix[21][15] = 404;
        distanceMatrix[15][16] = distanceMatrix[16][15] = 215;
        distanceMatrix[16][21] = distanceMatrix[21][16] = 435;
        distanceMatrix[17][22] = distanceMatrix[22][17] = 150;
        distanceMatrix[17][18] = distanceMatrix[18][17] = 416;
        distanceMatrix[18][22] = distanceMatrix[22][18] = 253;
        distanceMatrix[18][26] = distanceMatrix[26][18] = 344;
        distanceMatrix[18][19] = distanceMatrix[19][18] = 340;
        distanceMatrix[19][26] = distanceMatrix[26][19] = 453;
        distanceMatrix[19][27] = distanceMatrix[27][19] = 562;
        distanceMatrix[19][23] = distanceMatrix[23][19] = 192;
        distanceMatrix[19][20] = distanceMatrix[20][19] = 255;
        distanceMatrix[20][23] = distanceMatrix[23][20] = 291;
        distanceMatrix[20][24] = distanceMatrix[24][20] = 279;
        distanceMatrix[20][21] = distanceMatrix[21][20] = 244;
        distanceMatrix[21][24] = distanceMatrix[24][21] = 258;
        distanceMatrix[22][25] = distanceMatrix[25][22] = 242;
        distanceMatrix[22][26] = distanceMatrix[26][22] = 392;
        distanceMatrix[23][27] = distanceMatrix[27][23] = 415;
        distanceMatrix[23][28] = distanceMatrix[28][23] = 190;
        distanceMatrix[23][24] = distanceMatrix[24][23] = 249;
        distanceMatrix[24][29] = distanceMatrix[29][24] = 614;
        distanceMatrix[25][30] = distanceMatrix[30][25] = 205;
        distanceMatrix[25][31] = distanceMatrix[31][25] = 160;
        distanceMatrix[25][26] = distanceMatrix[26][25] = 282;
        distanceMatrix[26][31] = distanceMatrix[31][26] = 255;
        distanceMatrix[26][36] = distanceMatrix[36][26] = 530;
        distanceMatrix[26][32] = distanceMatrix[32][26] = 597;
        distanceMatrix[26][27] = distanceMatrix[27][26] = 203;
        distanceMatrix[27][32] = distanceMatrix[32][27] = 532;
        distanceMatrix[27][33] = distanceMatrix[33][27] = 197;
        distanceMatrix[27][34] = distanceMatrix[34][27] = 186;
        distanceMatrix[27][28] = distanceMatrix[28][27] = 145;
        distanceMatrix[28][34] = distanceMatrix[34][28] = 175;
        distanceMatrix[28][29] = distanceMatrix[29][28] = 244;
        distanceMatrix[29][34] = distanceMatrix[34][29] = 237;
        distanceMatrix[30][31] = distanceMatrix[31][30] = 252;
        distanceMatrix[31][35] = distanceMatrix[35][31] = 212;
        distanceMatrix[31][36] = distanceMatrix[36][31] = 434;
        distanceMatrix[32][36] = distanceMatrix[36][32] = 156;
        distanceMatrix[32][37] = distanceMatrix[37][32] = 129;
        distanceMatrix[32][33] = distanceMatrix[33][32] = 302;
        distanceMatrix[33][37] = distanceMatrix[37][33] = 397;
        distanceMatrix[33][38] = distanceMatrix[38][33] = 354;
        distanceMatrix[33][34] = distanceMatrix[34][33] = 160;
        distanceMatrix[34][38] = distanceMatrix[38][34] = 425;
        distanceMatrix[35][36] = distanceMatrix[36][35] = 200;
        distanceMatrix[37][39] = distanceMatrix[39][37] = 62;
        distanceMatrix[37][38] = distanceMatrix[38][37] = 103;
        distanceMatrix[38][39] = distanceMatrix[39][38] = 124;
        distanceMatrix[38][40] = distanceMatrix[40][38] = 127;
        distanceMatrix[38][41] = distanceMatrix[41][38] = 268;
        distanceMatrix[39][40] = distanceMatrix[40][39] = 108;
        distanceMatrix[40][41] = distanceMatrix[41][40] = 193;
        distanceMatrix[41][43] = distanceMatrix[43][41] = 111;
        distanceMatrix[41][44] = distanceMatrix[44][41] = 165;
        distanceMatrix[41][42] = distanceMatrix[42][41] = 153;
        distanceMatrix[42][44] = distanceMatrix[44][42] = 236;
        distanceMatrix[42][45] = distanceMatrix[45][42] = 106;
        distanceMatrix[43][46] = distanceMatrix[46][43] = 72;
        distanceMatrix[43][44] = distanceMatrix[44][43] = 101;
        distanceMatrix[44][46] = distanceMatrix[46][44] = 45;
        distanceMatrix[44][45] = distanceMatrix[45][44] = 68;
        distanceMatrix[45][47] = distanceMatrix[47][45] = 139;

        GraphTest G = new GraphTest();

        G.shortestPath(distanceMatrix);

    }

}







