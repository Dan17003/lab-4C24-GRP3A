public abstract class StudentReport {
    private String title;

    public StudentReport(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void generateReport();

    public void printReportDetails() {
        System.out.println("Título del reporte: " + title);
    }

    public void exportReport(String format) {
        System.out.println("Exportando reporte '" + title + "' en formato " + format);
    }
}
