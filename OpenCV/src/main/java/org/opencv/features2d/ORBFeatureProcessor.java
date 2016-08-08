
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.utils.Converters;

// C++: class javaORBFeature
//javadoc: javaORBFeature
public class ORBFeatureProcessor {

    protected final long nativeObj;
    protected ORBFeatureProcessor(long addr) { nativeObj = addr; }


    //
    // C++:  bool empty()
    //

    //javadoc: javaORBFeature::empty()
    public  boolean empty()
    {
        
        boolean retVal = empty_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  double getScaleFactor()
    //

    //javadoc: javaORBFeature::getScaleFactor()
    public  double getScaleFactor()
    {
        
        double retVal = getScaleFactor_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int descriptorSize()
    //

    //javadoc: javaORBFeature::descriptorSize()
    public  int descriptorSize()
    {
        
        int retVal = descriptorSize_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int descriptorType()
    //

    //javadoc: javaORBFeature::descriptorType()
    public  int descriptorType()
    {
        
        int retVal = descriptorType_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int getEdgeThreshold()
    //

    //javadoc: javaORBFeature::getEdgeThreshold()
    public  int getEdgeThreshold()
    {
        
        int retVal = getEdgeThreshold_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int getFastThreshold()
    //

    //javadoc: javaORBFeature::getFastThreshold()
    public  int getFastThreshold()
    {
        
        int retVal = getFastThreshold_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int getFirstLevel()
    //

    //javadoc: javaORBFeature::getFirstLevel()
    public  int getFirstLevel()
    {
        
        int retVal = getFirstLevel_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int getMaxFeatures()
    //

    //javadoc: javaORBFeature::getMaxFeatures()
    public  int getMaxFeatures()
    {
        
        int retVal = getMaxFeatures_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int getNLevels()
    //

    //javadoc: javaORBFeature::getNLevels()
    public  int getNLevels()
    {
        
        int retVal = getNLevels_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int getPatchSize()
    //

    //javadoc: javaORBFeature::getPatchSize()
    public  int getPatchSize()
    {
        
        int retVal = getPatchSize_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int getScoreType()
    //

    //javadoc: javaORBFeature::getScoreType()
    public  int getScoreType()
    {
        
        int retVal = getScoreType_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int getWTA_K()
    //

    //javadoc: javaORBFeature::getWTA_K()
    public  int getWTA_K()
    {
        
        int retVal = getWTA_K_0(nativeObj);
        
        return retVal;
    }


    //
    // C++: static javaORBFeature* create()
    //

    //javadoc: javaORBFeature::create()
    public static ORBFeatureProcessor create()
    {
        
        ORBFeatureProcessor retVal = new ORBFeatureProcessor(create_0());
        
        return retVal;
    }


    //
    // C++:  void compute(Mat image, vector_KeyPoint& keypoints, Mat descriptors)
    //

    //javadoc: javaORBFeature::compute(image, keypoints, descriptors)
    public  void compute(Mat image, MatOfKeyPoint keypoints, Mat descriptors)
    {
        Mat keypoints_mat = keypoints;
        compute_0(nativeObj, image.nativeObj, keypoints_mat.nativeObj, descriptors.nativeObj);
        
        return;
    }


    //
    // C++:  void compute(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat& descriptors)
    //

    //javadoc: javaORBFeature::compute(images, keypoints, descriptors)
    public  void compute(List<Mat> images, List<MatOfKeyPoint> keypoints, List<Mat> descriptors)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        List<Mat> keypoints_tmplm = new ArrayList<Mat>((keypoints != null) ? keypoints.size() : 0);
        Mat keypoints_mat = Converters.vector_vector_KeyPoint_to_Mat(keypoints, keypoints_tmplm);
        Mat descriptors_mat = new Mat();
        compute_1(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj, descriptors_mat.nativeObj);
        Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
        keypoints_mat.release();
        Converters.Mat_to_vector_Mat(descriptors_mat, descriptors);
        descriptors_mat.release();
        return;
    }


    //
    // C++:  void detect(Mat image, vector_KeyPoint& keypoints, Mat mask = Mat())
    //

    //javadoc: javaORBFeature::detect(image, keypoints, mask)
    public  void detect(Mat image, MatOfKeyPoint keypoints, Mat mask)
    {
        Mat keypoints_mat = keypoints;
        detect_0(nativeObj, image.nativeObj, keypoints_mat.nativeObj, mask.nativeObj);
        
        return;
    }

    //javadoc: javaORBFeature::detect(image, keypoints)
    public  void detect(Mat image, MatOfKeyPoint keypoints)
    {
        Mat keypoints_mat = keypoints;
        detect_1(nativeObj, image.nativeObj, keypoints_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void detect(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat masks = std::vector<Mat>())
    //

    //javadoc: javaORBFeature::detect(images, keypoints, masks)
    public  void detect(List<Mat> images, List<MatOfKeyPoint> keypoints, List<Mat> masks)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat keypoints_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        detect_2(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj, masks_mat.nativeObj);
        Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
        keypoints_mat.release();
        return;
    }

    //javadoc: javaORBFeature::detect(images, keypoints)
    public  void detect(List<Mat> images, List<MatOfKeyPoint> keypoints)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat keypoints_mat = new Mat();
        detect_3(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj);
        Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
        keypoints_mat.release();
        return;
    }


    //
    // C++:  void detectAndCompute(Mat image, Mat mask, vector_KeyPoint& keypoints, Mat descriptors)
    //

    //javadoc: javaORBFeature::detectAndCompute(image, mask, keypoints, descriptors)
    public  void detectAndCompute(Mat image, Mat mask, MatOfKeyPoint keypoints, Mat descriptors)
    {
        Mat keypoints_mat = keypoints;
        detectAndCompute_0(nativeObj, image.nativeObj, mask.nativeObj, keypoints_mat.nativeObj, descriptors.nativeObj);
        
        return;
    }


    //
    // C++:  void read(String fileName)
    //

    //javadoc: javaORBFeature::read(fileName)
    public  void read(String fileName)
    {
        
        read_0(nativeObj, fileName);
        
        return;
    }


    //
    // C++:  void setEdgeThreshold(int edgeThreshold)
    //

    //javadoc: javaORBFeature::setEdgeThreshold(edgeThreshold)
    public  void setEdgeThreshold(int edgeThreshold)
    {
        
        setEdgeThreshold_0(nativeObj, edgeThreshold);
        
        return;
    }


    //
    // C++:  void setFastThreshold(int fastThreshold)
    //

    //javadoc: javaORBFeature::setFastThreshold(fastThreshold)
    public  void setFastThreshold(int fastThreshold)
    {
        
        setFastThreshold_0(nativeObj, fastThreshold);
        
        return;
    }


    //
    // C++:  void setFirstLevel(int firstLevel)
    //

    //javadoc: javaORBFeature::setFirstLevel(firstLevel)
    public  void setFirstLevel(int firstLevel)
    {
        
        setFirstLevel_0(nativeObj, firstLevel);
        
        return;
    }


    //
    // C++:  void setMaxFeatures(int maxFeatures)
    //

    //javadoc: javaORBFeature::setMaxFeatures(maxFeatures)
    public  void setMaxFeatures(int maxFeatures)
    {
        
        setMaxFeatures_0(nativeObj, maxFeatures);
        
        return;
    }


    //
    // C++:  void setNLevels(int nlevels)
    //

    //javadoc: javaORBFeature::setNLevels(nlevels)
    public  void setNLevels(int nlevels)
    {
        
        setNLevels_0(nativeObj, nlevels);
        
        return;
    }


    //
    // C++:  void setPatchSize(int patchSize)
    //

    //javadoc: javaORBFeature::setPatchSize(patchSize)
    public  void setPatchSize(int patchSize)
    {
        
        setPatchSize_0(nativeObj, patchSize);
        
        return;
    }


    //
    // C++:  void setScaleFactor(double scaleFactor)
    //

    //javadoc: javaORBFeature::setScaleFactor(scaleFactor)
    public  void setScaleFactor(double scaleFactor)
    {
        
        setScaleFactor_0(nativeObj, scaleFactor);
        
        return;
    }


    //
    // C++:  void setScoreType(int scoreType)
    //

    //javadoc: javaORBFeature::setScoreType(scoreType)
    public  void setScoreType(int scoreType)
    {
        
        setScoreType_0(nativeObj, scoreType);
        
        return;
    }


    //
    // C++:  void setWTA_K(int wta_k)
    //

    //javadoc: javaORBFeature::setWTA_K(wta_k)
    public  void setWTA_K(int wta_k)
    {
        
        setWTA_K_0(nativeObj, wta_k);
        
        return;
    }


    //
    // C++:  void write(String fileName)
    //

    //javadoc: javaORBFeature::write(fileName)
    public  void write(String fileName)
    {
        
        write_0(nativeObj, fileName);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool empty()
    private static native boolean empty_0(long nativeObj);

    // C++:  double getScaleFactor()
    private static native double getScaleFactor_0(long nativeObj);

    // C++:  int descriptorSize()
    private static native int descriptorSize_0(long nativeObj);

    // C++:  int descriptorType()
    private static native int descriptorType_0(long nativeObj);

    // C++:  int getEdgeThreshold()
    private static native int getEdgeThreshold_0(long nativeObj);

    // C++:  int getFastThreshold()
    private static native int getFastThreshold_0(long nativeObj);

    // C++:  int getFirstLevel()
    private static native int getFirstLevel_0(long nativeObj);

    // C++:  int getMaxFeatures()
    private static native int getMaxFeatures_0(long nativeObj);

    // C++:  int getNLevels()
    private static native int getNLevels_0(long nativeObj);

    // C++:  int getPatchSize()
    private static native int getPatchSize_0(long nativeObj);

    // C++:  int getScoreType()
    private static native int getScoreType_0(long nativeObj);

    // C++:  int getWTA_K()
    private static native int getWTA_K_0(long nativeObj);

    // C++: static javaORBFeature* create()
    private static native long create_0();

    // C++:  void compute(Mat image, vector_KeyPoint& keypoints, Mat descriptors)
    private static native void compute_0(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj, long descriptors_nativeObj);

    // C++:  void compute(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat& descriptors)
    private static native void compute_1(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj, long descriptors_mat_nativeObj);

    // C++:  void detect(Mat image, vector_KeyPoint& keypoints, Mat mask = Mat())
    private static native void detect_0(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj, long mask_nativeObj);
    private static native void detect_1(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj);

    // C++:  void detect(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat masks = std::vector<Mat>())
    private static native void detect_2(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj, long masks_mat_nativeObj);
    private static native void detect_3(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj);

    // C++:  void detectAndCompute(Mat image, Mat mask, vector_KeyPoint& keypoints, Mat descriptors)
    private static native void detectAndCompute_0(long nativeObj, long image_nativeObj, long mask_nativeObj, long keypoints_mat_nativeObj, long descriptors_nativeObj);

    // C++:  void read(String fileName)
    private static native void read_0(long nativeObj, String fileName);

    // C++:  void setEdgeThreshold(int edgeThreshold)
    private static native void setEdgeThreshold_0(long nativeObj, int edgeThreshold);

    // C++:  void setFastThreshold(int fastThreshold)
    private static native void setFastThreshold_0(long nativeObj, int fastThreshold);

    // C++:  void setFirstLevel(int firstLevel)
    private static native void setFirstLevel_0(long nativeObj, int firstLevel);

    // C++:  void setMaxFeatures(int maxFeatures)
    private static native void setMaxFeatures_0(long nativeObj, int maxFeatures);

    // C++:  void setNLevels(int nlevels)
    private static native void setNLevels_0(long nativeObj, int nlevels);

    // C++:  void setPatchSize(int patchSize)
    private static native void setPatchSize_0(long nativeObj, int patchSize);

    // C++:  void setScaleFactor(double scaleFactor)
    private static native void setScaleFactor_0(long nativeObj, double scaleFactor);

    // C++:  void setScoreType(int scoreType)
    private static native void setScoreType_0(long nativeObj, int scoreType);

    // C++:  void setWTA_K(int wta_k)
    private static native void setWTA_K_0(long nativeObj, int wta_k);

    // C++:  void write(String fileName)
    private static native void write_0(long nativeObj, String fileName);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
