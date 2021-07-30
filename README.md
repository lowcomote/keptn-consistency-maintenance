# Towards Continuous Consistency Checking of DevOps Artefacts

This repository contains the proof of concept implementation of the case study presented in the workshop paper for DevOps@MODELS21.

## Setup

1. Install JDK11. One possible repository to download a JDK11 distribution from is https://jdk.java.net/archive/.

2. Download the Eclipse from https://drive.google.com/file/d/1n3WR15GD6lj2iz-gCkqQbOkWLy0phFo7/view?usp=sharing (Windows only).

3. Unzip the downloaded archive and run `eclipse.exe`.

5. Set the character encoding to `UTF-8`: Window menu -> Preferences -> General -> Workspace -> Text file encoding: Other, select UTF-8 from the dropdown menu.

6. Clone the `main` branch of this repository: https://github.com/lowcomote/keptn-consistency-maintenance.git

7. Import every project except `examples` into the Eclipse. Enable `Search for nested projects` in the Import Wizard.

8. Enable automatic build and trigger a rebuild: 
    * Project menu -> Build Automatically. 
    * Project menu -> Clean -> Clean all projects.

## Consistency checking and model repair demo

1. Right click on project `eu.lowcomote.kept.fixes` -> Run as -> Eclipse application. Select `Launch Runtime Eclipse`.

2. In the runtime eclipse, import the `examples` project from the `main` branch of the repository.

3. Open `example.sli` in the `Sli Editor`: right click on the file -> Open With -> `Sli Editor`. If the Editor is not visible then browse it in `Other...`.

4. In the opened editor you will see two `SLI indicators`: `response_time_p95` and `response_time_p90`.

5. Open the `example.slo` in the `Slo Editor`: right click on the file -> Open With -> `Slo Editor`. If the Editor is not visible then browse it in `Other...`.

6. In the opened editor you will see two `objectives` that refer to the aforementioned SLI indicators in their `sli` fields.

7. Open the `example.sli2slo` with the `Sample Reflective Ecore Model Editor`: right click on the file -> Open With -> `Sample Reflective Ecore Model Editor`. If the Editor is not visible then browse it in `Other...`.

8. In the opened editor, navigate to `platform:/resource/examples/example.sli2slo` -> Sli2 Slo Links -> Sli2 Slo Link.

9. Click on `Sli2 Slo Link`.

10. Enable VIATRA validation: right click in the editor -> VIATRA Validation -> Initialize VIATRA Validators on Editor.

11. Enable automatic model repairs: right click in the editor -> Enable model repairs.

12. Trigger concistency check: 

      1. In the editor, navigate to `platform:/resource/examples/example.sli` -> Sli Root -> Service Level Indicators -> Service Level Indicators Indicators.
      2. Click on Service Level Indicators Indicators Pattern Properties0 response_time_p95.
      3. Open Properties view: Window menu -> Show View -> Properties.
      4. In the Properties view, change `response_time_p95` to `response_time_p94`.

13. As soon as the consistency check is completed, it will ask for confirmation before applying an automatic model repair action. Click on yes to accept the proposed model repair action.

14. Save the opened file in the editor.

15. Open the `example.sli` and the `example.slo` files with their respective editors and find the update SLI indicator name (`response_time_p94`) there.

In this way, the consistency of the SLI indicator names were checked and fixed between the SLI and SLO models of Keptn.

## Contributors

- Alessandro Colantoni
- Benedek Horváth

## Acknowledgement

This research is supported by the Lowcomote Training Network, which has received funding from the European Union’s Horizon 2020 Research and Innovation Programme under the Marie Skłodowska-Curie grant agreement n° 813884.
