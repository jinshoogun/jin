package test.bean;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

public class DownloadView extends AbstractView {
	public DownloadView() {
		setContentType("application/download;charset=UTF-8");
	}

	protected void renderMergedOutputModel(Map<String, Object> arg0, HttpServletRequest arg1, HttpServletResponse arg2)
			throws Exception {
		File file = (File) arg0.get("downloadFile");
		arg2.setContentLength((int) (file.length()));
		arg2.setContentType(getContentType());
		String fileName = java.net.URLEncoder.encode(file.getName(), "UTF-8");
		arg2.setHeader("Content-Disposition", "attachment; filename = \"" + fileName + "\";");
		arg2.setHeader("Content-Transfer-Encoding", "binary");

		ServletOutputStream out = arg2.getOutputStream();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			FileCopyUtils.copy(fis, out);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
				}
			}
		}
		out.flush();

	}
}
