# Architecture

## Overview

Privacy Guard AI detects personally identifiable information in documents and applies reviewable redaction policies before sharing.

## Data Flow

1. React provides document review and approval.
1. FastAPI manages redaction workflows.
1. spaCy pipelines detect sensitive entities.
1. PostgreSQL stores policies and non-sensitive audit metadata.

## Design Goals

- Keep security decisions explainable and reviewable.
- Separate ingestion, analysis, and presentation concerns.
- Preserve evidence integrity without retaining unnecessary sensitive data.
- Allow individual components to scale independently.
