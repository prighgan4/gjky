public class Films {
    String[] films = {
            "numberOne",
            "trolli",
            "nevedimka",
            "dzentelmeni",
            "hotelBelgrad",
            "vpered",
            "bladShot",
            "transformers1",
            "transformers 2"
    };
    private Films[] items = new Films[0];

    public Films[] add(Films item) {
        public Films[] getAll() {
            Films[] result = new Films[items.length];

            for (int i = 0; i < result.length; i++) {
                int index = item.films.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }

    }
}
