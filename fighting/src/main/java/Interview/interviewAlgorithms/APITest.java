package Interview.interviewAlgorithms;

import java.io.*;
import java.net.*;

import org.json.*;

/**
 * 打一个api，获取Response并转成Json格式，再处理数据
 */
class APITest {

    private static final String BASE_URL = "https://jsonmock.hackerrank.com/api/tvseries?page=";

    public static String bestInGenre(String genre) {
        try {
            int currentPage = 1;
            int totalPages = Integer.MAX_VALUE;
            String bestSeriesName = null;
            double highestRating = -1;

            while (currentPage <= totalPages) {
                String response = readUrl(BASE_URL + currentPage);
                JSONObject jsonObject = new JSONObject(response);
                totalPages = jsonObject.getInt("total_pages");
                JSONArray data = jsonObject.getJSONArray("data");

                for (int i = 0; i < data.length(); i++) {
                    JSONObject series = data.getJSONObject(i);
                    String seriesGenre = series.getString("genre");
                    if (seriesGenre.contains(genre)) {
                        double imdbRating = series.getDouble("imdb_rating");
                        String name = series.getString("name");

                        if (imdbRating > highestRating || (imdbRating == highestRating && (bestSeriesName == null || name.compareTo(bestSeriesName) < 0))) {
                            highestRating = imdbRating;
                            bestSeriesName = name;
                        }
                    }
                }
                currentPage++;
            }
            return bestSeriesName;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String readUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    public static void main(String[] args) {
        System.out.println(bestInGenre("Action"));
    }
}
