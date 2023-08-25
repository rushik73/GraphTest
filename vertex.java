
class Vertex {
    public boolean known;
    public int distance;
    public int previousVertex;

    public Vertex() {
        known = false;
        distance = Integer.MAX_VALUE;
        previousVertex = 0;
    }
}

