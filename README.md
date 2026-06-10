# Privacy Guard AI

Privacy Guard AI detects personally identifiable information in documents and applies reviewable redaction policies before sharing.

> Portfolio concept project focused on practical AI and cybersecurity workflows.

## Core Features

- PII entity detection for structured and free text
- Configurable masking and tokenization rules
- Side-by-side redaction review
- Privacy risk and processing report

## Technology

`python` | `spacy` | `fastapi` | `react` | `postgresql` | `docker`

## Architecture

1. React provides document review and approval.
1. FastAPI manages redaction workflows.
1. spaCy pipelines detect sensitive entities.
1. PostgreSQL stores policies and non-sensitive audit metadata.

## Security Principles

- Original documents are encrypted at rest
- Configurable automatic retention expiry
- Redaction approval separated by role
- Sensitive text excluded from application logs

## Project Status

This repository contains a portfolio-ready system design and metadata set. The scope is intentionally limited to a demonstrable concept rather than a production deployment.

## License

MIT License
